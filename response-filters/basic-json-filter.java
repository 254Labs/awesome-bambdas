/*
  Author: Gareth Heyes (https://x.com/garethheyes)
  Source: X (Twitter)
  Init Pub. Date: Oct 18, 2023
*/

if(!requestResponse.hasResponse()) {
  return false;
}

if(requestResponse.response().hasHeader("Content-Type")) {
  if(!requestResponse.response().headerValue("Content-Type").contains("text/html")) {
    return false;
  }
}

String body = requestResponse.response().bodyToString().trim();
boolean looksLikeJson = body.startsWith("{") || body.startsWith("[");

if(!looksLikeJson) {
  return false;
}

return true;

