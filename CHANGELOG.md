# Trulioo SDK for Java Changelog

## Version 1.0.4

Support application/pdf in documentDownload

## Version 1.0.3

Changed type of Model/AppendedField's Data from string to Object in order to allow WatchListDetails, returned as Map, parsable.

## Version 1.0.2.0

Updated writeTimeOut to 60 seconds based on PR#5
Added following methods which are currently supported by Trulioo's Normalized API:
    -GetDatasources
    -GetTransactionStatus
    -BusinessSearch
    -BusinessSearchResult
Updated Json serializer to properly encode image in byte[] to String(base64)

## Version 1.0.0.1

Upgraded okhttp to 3.9.1

## Version 1.0.0.0

## In Private 

Initial Trulioo SDK for Java in private testing.
