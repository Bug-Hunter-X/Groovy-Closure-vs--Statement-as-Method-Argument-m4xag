```groovy
class MyClass {
    def methodWithClosure(closure) {
        println "Before closure execution"
        closure()
        println "After closure execution"
    }
}

MyClass myClass = new MyClass()

// This will execute the closure successfully
myClass.methodWithClosure { println "Inside closure" }

// This will throw a MissingMethodException
myClass.methodWithClosure(println "Inside closure")
```