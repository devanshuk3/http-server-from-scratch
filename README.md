# HTTP Server from scratch made entirely in java

There are two different folders: src and test-pre

the src folder contains the main source files that will be included as the project progresses.

the test-pre folder contains all the prerequisites that a person needs to know in order to build this project.
It contains the basic implementations of the fundamental concepts like websockets, buffered readers, print writers, and data streams in java.

These implementations are only for the general understanding and can be completely skipped accordingly.


## Date Wise Updates: 

**5/7/26**: Started with the prerequisites of the underlying fundamentals for building a web server. It includes sockets, buffer readers and stream readers, Input and output streams, String functions and String Builders.

**6/7/26**: Added a basic working prototype of a web server. It reads the requests from the browser through inputStreamReader and then, that data is parsed into parts by splitting the first line of the headers. Those headers alongwith the entire request are then printed on the console.