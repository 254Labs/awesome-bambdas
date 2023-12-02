---
title: Incorrect Content-Length
parent: Response Bambdas
layout: default # DO NOT CHANGE
has_toc: false # DO NOT CHANGE 
has_children: false # DO NOT CHANGE
---

```java
/*
  Author: James Kettle (https://x.com/albinowax)
  Source: X (Twitter)
  Init Pub. Date: Oct 17, 2023
  Use Case: 
    Filter for responses with incorrect Content-Length.
*/

if(!requestResponse.hasResponse() || requestResponse.response().hasHeader("Content-Length")) {
  return false;
}

int declaredContentLength = Integer.parseInt(requestResponse.response().headerValue("Content-Length"));
int realContentLength = requestResponse.response().body().length();

return declaredContentLength != realContentLength;

```