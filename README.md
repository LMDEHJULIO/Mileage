// Java is object oriented, but there are cases where a utility methods may be needed where you do not need an instance of a class

    // The static keyword lets a method run wtihout any instance of the class

    // // static means behavior is not dependent on an instance varialbe, so not instance/ojbject is required. Just the class

    //E.g. Math.min(x,y)

    // a non static method is called using a reference variable name

    // classes tht are not meant to be instantiated often have static methods - e.g. abstract class

    // marking the contructor itself private also prohibits anyone from making an instance of it

    // You're free to comibnne static and non -static methods in a class - even though a single non-static method means there must be a way to make an instance


    // Static methods can't use non-static methods, etither

    // Non statics - use instance variable state to affec the behavior of the method. A getName method returns the vlaue of the name varialbe etc

    // Static methods cna't use non-static methods either - they CANNOT see instance varialbe state

    // With a static variable - the value is the same for all instances of the class

    // instances can all point to the same varialbe without it being reset

    // stats are initialized when a class is loaded - a class is laoded bc the jvm decides its tiem to load it

    // stat vrs are initialzied before any object of that class can be created

    // stat vrs are initalized before any static method of the class runs

    // if u don't explicitly initialize, it is done implicityl

    // static final variables are constants e.g. public static final double PI = 3.141592653589793

    // constants are in all caps

    // a static initializer is a block of code that runs when a class is loaded before any other code can use the class, so its a great place to initalize a static final variable

    class ConstantInit1 {
        final static int X;

        static {
            X = 42;
        }

    }

    // you can finalize methods as well, meaning ait cannot be overriden
    // finalizing a class means you can't extend

    /*
        Math.abs - the absolute value of an argument
        Math.random - returns random value between 0.0 and 10
        Math.rouynd - round to nearest integer


        WRAPPING A PRIMITIVE

        Java autoboxes primitives for you

        The rule of generic types is that you can only specify a class or interface types not rpimitives

        Making big nums more readable w underscore

        Formatting a number to use commas String.format("%,d", myBillion)

        FORMATTING DECONSTRUCTED

        Fromattting instructions
        You use special format specifiers that describe how the argument should be formatted

        The argument to be formatted

        % - insert argument here e

        %,d  0insert commas and format the number as a decimal

        %.2f - format the number as a floating point with a precision of two decimal places

        %,.2f insret commas and format

        format specifier
        [] - optional
        % and type required
        order is madatory


        static imports

        To use the Math class, the first step is to make an instance of it.

        False
        You can mark a constructor with the keyword “static.”

        False
        Static methods don’t have access to an object’s instance variables.

        True
        It is good practice to call a static method using a reference variable.

        False
        Static variables could be used to count the instances of a class.

        True
        Constructors are called before static variables are initialized.

        False
        MAX_SIZE would be a good name for a static final variable.

        True
        A static initializer block runs before a class’s constructor runs.

        True
        If a class is marked final, all of its methods must be marked final.

        False
        A final method can be overridden only if its class is extended.

        False
        There is no wrapper class for boolean primitives.

        False
        A wrapper is used when you want to treat a primitive like an object.

        True
        The parseXxx methods always return a String.

        False
        Formatting classes (which are decoupled from I/O) are in the java.format package.
    * */