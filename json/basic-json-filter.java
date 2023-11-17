if(!requestResponse.hasResponse()) {
  return false;
}

if(requestResponse.response().hasHeader("Content-Type")) {
  if(!requestResponse.response().hasHeaderValue("Content-Type").containes("text/html")) {
    return false;
  }
}

String body = requestResponse.response().bodyToString().trim();
boolean lokksLikeJson = body.startsWith("{") || body.startsWith("[");

if(!lloksLikeJson) {
  return false;
}

return true;
