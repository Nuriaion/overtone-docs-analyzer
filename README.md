# overtonedocs-analyzer

## Getting Started

Set up the Rails app and database first by following the README here
https://github.com/xavriley/clojuredocs

Then clone the overtone repo to your local machine `git clone git@github.com:overtone/overtone.git`

Then clone this repo, cd into the cloned directory

Change the project.clj file to use the version of overtone you want to
index as a dependency.

You're now ready to run
    lein run "/path/to/my/overtone"

Which will whizz through all the functions in overtone, and hopefully
add them to your local postgres database.

Good luck!

## License

EPL 1.0 http://www.eclipse.org/legal/epl-v10.html
