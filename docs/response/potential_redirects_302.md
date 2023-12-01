---
title: Potential Open Redirects 302 Based
parent: Response Bambdas
layout: default # DO NOT CHANGE
has_toc: false # DO NOT CHANGE 
has_children: false # DO NOT CHANGE
---

```java
/*
  Author: / XNL -н4cĸ3r (https://x.com/xnl_h4ck3r)
  Source:  X/Twitter (https://x.com/xnl_h4ck3r/status/1724812731008631187/photo/1)
  Init Pub. Date: Nov 22, 2023
  Use Case: 
    Filter for responses that redirect to probe for Open Redirection vulnerabilities.
  Addl. Info:
    - If a 302 response has a large body, it could have something useful in there
    and also potentially be bypassed by matching and replacing "302 Found" with
    "200 OK" and removing "Location" header from the request.
    - Reason for counting hrefs: A normal 302 often has a href to the redirect page
    in case it doesn't redirect. If there's more than 1 href, there's probably other
    interesting content. It's an extra check just in case the content length is still
    lower than the value we're looking for.
*/

if(!requestResponse.hasResponse() && requestResponse.response().statusCode() != 302) {
  return false;
}

var response = requestResponse.response();
var bodyLength = response.body().toString().toLowerCase().replaceAll("<a.*</a>", "").length();
var numberofHrefs =  response.body().countMatches("href=", false);

return (bodyLength > 1000 || numberOfHrefs > 1);

```