Java command line application, which  read a text formatted log file.
The application  parse the content of this log file and filter it based on timestamp.
The application  get timestamp as an input parameter for which logs are looked for and can have the following format:
  •	Whole month, e.g. 2021-10
  •	Day of the month, e.g. 2021-10-12
  •	Specific time, e.g. 22:14:15
  •	Time splice (two specific time), e.g. 22:14:15-22:24:15
Resulting output formatted as table and saved into html file. In the table, name of the columns  follow IETF-syslog format (HEADER STRUCTURED-DATA MSG)
and rows will contain data from the log file.
