# Contribution Guidelines
Please note that this project is released with a [Contributor Code of Conduct](CODE_OF_CONDUCT.md). By participating in this project, you agree to abide by its terms.

## Adding a Bambda
All Bambdas are classified based on the method that follows the requestReponse Object. Thus, all request-based filters are placed in [docs/request](https://github.com/254Labs/awesome-bambdas/blob/main/docs/request) directory and all response-based filters are placed under [docs/response](https://github.com/254Labs/awesome-bambdas/blob/main/docs/response) directory. Utilities or tips and tricks can be found under [docs/utilities](https://github.com/254Labs/awesome-bambdas/blob/main/docs/utilities).

To add your new Bambda:
+ Copy [_bambda.md.template](https://github.com/254Labs/awesome-bambdas/blob/main/docs/_bambda.md.template) into the correct folder mentioned above. 
+ Rename the file according to your Bambda title/name.
	+ Keep it short
	+ Spaces must be replaced by `_`
+ In the frontmatter of the Markdown file:
	+ Adjust `title` to a nicely formatted name of your Bambda
	+ Adjust `parent` to the correct category (Request Bambdas, Response Bambdas, Utilities)
+ Add your Bambda as Java code into the code block
	+ At the top of the code block, set the attribution to correctly link the creator of the Bambda
+ Submit a PR

## Preview Site Locally
Run `make local` while in the root of the repository. This will build and start a Docker container to preview the site at [http://127.0.0.1:4000](http://127.0.0.1:4000).