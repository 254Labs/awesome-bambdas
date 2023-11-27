/*
  Author: Tolgaha (https://x.com/TolgaDemirayak)
  Source:  X/Twitter (https://x.com/TolgaDemirayak/status/1727074336056783190/)
  Init Pub. Date: Nov 22, 2023
  Use Case: 
    Filter for responses that contain JavaScript based on content-type header value.
*/

if (!requestResponse.request().isInScope()) {
  return false;
}

var contentTypeValue = requestResponse.response().headerValue("Content-Type");

if (contentTypeValue != null) {
   if (contentTypeValue.contains("application/javascript") &&
     contentTypeValue.contains("text/javascript") &&
     contentTypeValue.contains("application/x-javascript")) {
       return false;
   }
}

return true;
