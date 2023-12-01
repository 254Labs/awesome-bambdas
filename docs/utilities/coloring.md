---
title: Coloring
parent: Utilities
layout: default
has_toc: false
has_children: false
---

```java
/*
  Author: rtfmkiesel (https://github.com/rtfmkiesel)
  Source: GitHub
  Init Pub. Date: Nov 30, 2023
  Use Case: 
    Color response based on certain conditions
*/

/*
  if (YOUR CONDITION) {
    requestResponse.annotations().setHighlightColor(HighlightColor.<YOUR COLOR>);
  }
*/

// Example: Status Code
// Make all client errors blue
if (response.isStatusCodeClass(StatusCodeClass.CLASS_4XX_CLIENT_ERRORS)) {
	requestResponse.annotations().setHighlightColor(HighlightColor.BLUE);
}
// Make all server errors red
if (response.isStatusCodeClass(StatusCodeClass.CLASS_5XX_SERVER_ERRORS)) {
	requestResponse.annotations().setHighlightColor(HighlightColor.RED);
}
```