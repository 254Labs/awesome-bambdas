/*
  Author: Sajeeb Lohani (https://github.com/prodigysml/)
  Source: GitHub
  Init Pub. Date: Nov 02, 2023
  Use Case:
   Filter for a set of responses made before a given datetime.
*/

if (!requestResponse.hasResponse()){
    return false;
}

long epoch = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2023-01-01 00:00:00").getTime() / 1000;

if (epoch < requestResponse.time().toEpochSecond()){
	return true;
}

return false;