# logback-db

As of version 1.2.8, logback no longer ships with `DBAppender`.

The logback-db project remedies this omission by providing `DBAppender` for `logback-classic` and `logback-access`.

More specifically, the `logback-classic-db` module contains `DBAppender` for `logback-classic` wheread the `logback-acess-db` module contains `DBAppender` for `logback-access`. Both modules require `logback-code-db` module as a prerequisite.

Here are the Maven coordinates for the aforementioned  components:

  `ch.qos.logback.db:logback-core-db:VERSION`  
  `ch.qos.logback.db:logback-classic-db:VERSION`  
  `ch.qos.logback.db:logback-access-db:VERSION`
 
As of 2026-03-17, *1.5.32* is the latest release version.

See also https://logback.qos.ch/news.html for the latest available release version.
