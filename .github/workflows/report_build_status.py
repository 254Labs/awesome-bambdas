import requests
import os

repo = os.getenv("GITHUB_REPOSITORY")
commit_sha = os.getenv("GITHUB_SHA")
status = "success" if os.getenv("BUILD_STATUS") == "success" else "failure"

url = f"https://api.github.com/repos/{repo}/statuses/{commit_sha}"

headers = {
    "Authorization": f"Bearer {os.getenv('GH_TOKEN')}",
    "Accept": "application/vnd.github.v3+json",
}

data = {
    "state": status,
    "target_url": f"https://github.com/{repo}/actions/runs/{os.getenv('GITHUB_RUN_ID')}",
    "description": "Build Status",
    "context": "continuous-integration/build",
}

response = requests.post(url, json=data, headers=headers)

if response.status_code != 201:
    print(f"Failed to report build status. Status Code: {response.status_code}")
    print(response.text)
    exit(1)
