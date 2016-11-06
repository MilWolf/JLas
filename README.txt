The JLas library allows to read files in the .las or .laz format from Java language in the most easiest way.
The .las reader is using pure Java language, however the .laz reader uses a wrapper of the laszip library.

Las reader features:

	-Read las header
	-Read las format until 1.4
	-Read las point format until format 3

	You cannot :
	-Write las file

Laz reader features:

	-Read las format until 1.4
	-Read las point format until format 1.0
	-Read las point attributes : x, y, z, echo range, echo number, echo recording time, echo intensity, echo classification

	You cannot :
		-Write laz file
		-Read other attributes than x, y, z, echo range, echo number, echo recording time, echo intensity, echo classification
		-Use this library with 32 bits JVM, and other systems than Windows and Linux.
