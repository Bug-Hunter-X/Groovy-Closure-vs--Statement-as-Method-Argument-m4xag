# Groovy Closure vs. Statement as Method Argument

This example demonstrates a subtle error in Groovy related to the use of closures as method arguments.

Groovy's dynamic nature and support for closures allows you to pass code blocks as parameters. However, a common mistake is misinterpreting how to pass the closure to the method which executes the code.

The file `bug.groovy` contains code that showcases this error.  Running this code produces a `MissingMethodException`.  The file `bugSolution.groovy` provides the corrected version.

## How to Reproduce

1. Save the code in `bug.groovy`.
2. Execute the Groovy script: `groovy bug.groovy`

## Solution

The solution lies in understanding the correct way to pass a closure as an argument in Groovy. The solution is provided in `bugSolution.groovy`