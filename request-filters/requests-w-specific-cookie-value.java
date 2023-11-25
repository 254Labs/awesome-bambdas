/*
  Author: PortSwigger (https://portswigger.net)
  Source:  PortSwigger Blog (https://portswigger.net/blog/introducing-bambdas)
  Init Pub. Date: Nov 14, 2023
  Use Case: 
    Filter for requests with a specific cookie value.
*/

var request = requestResponse.request();
var cookie = request.parameter("foo", HttpParameterType.COOKIE);

cookie != null && cookie.value().conatins("1337");
