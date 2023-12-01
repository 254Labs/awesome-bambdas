---
title: JSON Filter
parent: Response Bambdas
layout: default # DO NOT CHANGE
has_toc: false # DO NOT CHANGE 
has_children: false # DO NOT CHANGE
---

```java
/*
  Author: Gareth Heyes (https://x.com/garethheyes)
  Source: X (Twitter)
  Init Pub. Date: Oct 18, 2023
  Use Case: 
    Filter for JSON endpoints with an empty or text/html MIME-type
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

```