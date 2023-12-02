---
title: JSON with Content-Type Mismatch
parent: Response Bambdas
layout: default # DO NOT CHANGE
has_toc: false # DO NOT CHANGE 
has_children: false # DO NOT CHANGE
---

```java
/*
  Author: PortSwigger (https://portswigger.net)
  Source:  PortSwigger Blog (https://portswigger.net/blog/introducing-bambdas)
  Init Pub. Date: Nov 14, 2023
  Use Case: 
    Filter for responses with JSON body but wrong content-type header value set.
*/

var contentType = requestResponse.response().headerValue("Content-Type");

if (contentType != null && !contentType.contains("application/json")) {
    String body = requestResponse.response().bodyToString().trim();

    return body.startsWith( "{" ) || body.startsWith( "[" );
}

return false;

```