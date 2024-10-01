/*
  Author: 0x999 (https://x.com/_0x999/)
  Source:  X/Twitter (https://x.com/_0x999/status/1727072149058535791/photo/2)
  Init Pub. Date: Nov 22, 2023
  Use Case: 
    Filter for responses that contain Cache header to probe for Cache-Poisioning vulnerabilities.
*/

if(!requestResponse.hasResponse()) {
  return false;
}

var headers = requestResponse.response().headers();

for (var header : headers) {
 if (header.name().toLowerCase().contains("cache") &&
    (header.value().toLowerCase().contains("hit") || 
    header.value().toLowerCase().contains("miss"))) {
    return true;
  }
}
     
return false;
