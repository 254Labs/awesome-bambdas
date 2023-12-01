---
title: Redirection with Cookie
parent: Response Bambdas
layout: default # DO NOT CHANGE
has_toc: false # DO NOT CHANGE 
has_children: false # DO NOT CHANGE
---

```java
/*
  Author: PortSwigger (https://portswigger.net)
  Source: PortSwigger Docs (https://portswigger.net/burp/documentation/desktop/tools/proxy/http-history/bambdas)
  Init Pub. Date: Oct 20, 2023
  Use Case: 
    Filter for responses that have a 3XX status code and a cookie set with the name session.
*/

if (!requestResponse.hasResponse()) {
    return false;
}

var response = requestResponse.response();
return response.isStatusCodeClass(StatusCodeClass.CLASS_3XX_REDIRECTION) && response.hasCookie("session");

```