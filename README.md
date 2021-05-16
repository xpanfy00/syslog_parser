<h1>Syslog parser Java Programm</h1>
<p>Java command line application, which  read a text formatted log file.</p>
<p>The application  parse the content of this log file and filter it based on timestamp.</p>
<p>The application  get timestamp as an input parameter for which logs are looked for and can have the following format:
  <Table>
  <tr><td>•	Whole month, e.g. 2021-10</tr></td>
  <tr><td>•	Day of the month, e.g. 2021-10-12</tr></td>
  <tr><td>•	Specific time, e.g. 22:14:15</tr></td>
  <tr><td>•	Time splice (two specific time), e.g. 22:14:15-22:24:15</tr></td>
  <Table>
  </p>
<p>Resulting output formatted as table and saved into html file. In the table, name of the columns  follow IETF-syslog format (HEADER STRUCTURED-DATA MSG)
and rows will contain data from the log file.</p>
