import org.specs2.mutable.Specification

object FooSpec extends Specification {

  "the sayHello method" >> {
    "says 'Hello I'm Foo'" >> {
      val helloMessage = Foo.sayHello()
      helloMessage mustEqual "Hello, I'm Fooo!"
    }
  }

}
