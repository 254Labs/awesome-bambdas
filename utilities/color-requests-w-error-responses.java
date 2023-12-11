/*
  Author: rtfmkiesel (https://github.com/rtfmkiesel)
  Source: GitHub
  Init Pub. Date: Nov 30, 2023
  Use Case: 
    Color requests based on error responses to differentiate between client and server errors
*/

var response = requestResponse.response();

// Color all client errors - Blue
if (response.isStatusCodeClass(StatusCodeClass.CLASS_4XX_CLIENT_ERRORS)) {
	requestResponse.annotations().setHighlightColor(HighlightColor.BLUE);
}

// Color all server errors - Red
if (response.isStatusCodeClass(StatusCodeClass.CLASS_5XX_SERVER_ERRORS)) {
	requestResponse.annotations().setHighlightColor(HighlightColor.RED);
}

return true;
