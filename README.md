# scala-starter
This repo is created for Scala newbies which helps in quick jump start.

## Steps this course will take you :
1. Explain the importance and necessity of Functional reactive programming (FRP)
2. Why to choose Scala for FRP 
3. Go through the basic constructs in Scala
4. Attempting and Completing all `S-99: Ninety-Nine Scala Problems`
5. Implementing every FRP concepts & paradigm
6. Talking about the Top frameworks in Scala
7. Create a enterprise application
8. Develop frameworks in Scala for scalability

## 1. Functional reactive programming 

### Functional programming :

##### What? 
```
Functional programming (often abbreviated FP) is the process of building 
software by composing pure functions, avoiding shared state, mutable data, 
and side-effects. Functional programming is declarative rather than imperative, 
and application state flows through pure functions. Contrast with object oriented 
programming, where application state is usually shared and colocated with methods 
in objects.

Functional programming is a programming paradigm, meaning 
that it is a way of thinking about software construction based on some 
fundamental, defining principles (listed above). Other examples of programming 
paradigms include object oriented programming and procedural programming.

```
Resources : 
1. https://medium.com/javascript-scene/master-the-javascript-interview-what-is-functional-programming-7f218c68b3a0

##### Why? 
```
Solve Concurrency and Parallelism
```

##### How?
With the features of functional programming paradigm, Concurrency and Parallelism comes by default. 

Below are few key features of FP

```
First-Class Functions
High-Order Functions
Pure Functions
Closures
Immutable State

```
Resources : 
1. https://medium.com/@jugoncalves/functional-programming-should-be-your-1-priority-for-2015-47dd4641d6b9


### Reactive programming :

##### What? 
```
Reactive programming is a declarative programming paradigm concerned with data streams and the 
propagation of change. This means that it becomes possible to express static (e.g. arrays) or 
dynamic (e.g. event emitters) data streams with ease via the employed programming language(s), and that an 
inferred dependency within the associated execution model exists, which facilitates the automatic propagation 
of the change involved with data flow.
```

Resources : 
1. https://en.wikipedia.org/wiki/Reactive_programming

##### Why ? 

```
Reactive Programming is programming with asynchronous data streams.
Observables can be cold or hot – and it matters.
Misused asynchrony bites
Keep things simple
```

Resources : 
1. https://dzone.com/articles/only-introduction-reactive
2. https://developers.redhat.com/blog/2017/06/30/5-things-to-know-about-reactive-programming/

##### How? 

Reactive programming is achieved through Event based architecture.


### Functional Reactive programming :

##### What?
```
Functional reactive programming (FRP) is a programming paradigm for reactive programming 
(asynchronous dataflow programming) using the building blocks of functional programming (e.g. map, reduce, filter). 
FRP has been used for programming graphical user interfaces (GUIs), robotics, and music, aiming to simplify these 
problems by explicitly modeling time.[citation needed]
```

##### Why?
```
Functional Reactive Programming (FRP) integrates time flow and compositional events into functional programming. 
This provides an elegant way to express computation in domains such as interactive animations, robotics, computer vision, user interfaces, and simulation.
```

Resources : 
1. http://blog.danlew.net/2017/07/27/an-introduction-to-functional-reactive-programming/
2. https://wiki.haskell.org/Functional_Reactive_Programming
3. https://medium.com/@cesarmcferreira/why-you-should-be-doing-functional-reactive-programming-858bd9bb8001
4. https://medium.com/@kuassivi/functional-reactive-programming-with-rxjava-part-1-dc33aa9b5492
5. https://android.jlelse.eu/how-to-wrap-your-imperative-brain-around-functional-reactive-programming-in-rxjava-91ac89a4eccf

##### How?

FRP is a paradigm which implements both functional and reactive approach of programming together.



## 2. Why Scala for FRP?

Scala, as a functional language, has been given the tools necessary to go reactive, making concurrency and distribution easier and giving a nice and elegant way to asynchronous programming.

Resources :

1. https://hackernoon.com/functional-programming-what-language-should-you-be-talking-313dd8bc379b
2. http://crscardellino.me/2014/08/11/why-did-i-choose-scala.html
3. https://www.quora.com/Should-I-use-Scala-instead-of-Haskell-to-learn-functional-programming-as-Scala-is-more-widely-used-and-practical
4. https://www.quora.com/I-want-to-learn-a-functional-language-Which-one-is-the-best-Scala-Clojure-etc-and-why


##### Pros
```
Higher Productivity & Quality
Better Developers
Rapidly Improving Ecosystem
```

##### Cons
```
Learning Curve
Limited Developer Pool
Better Developers
Limited Commercial Support
Tool Immaturity
```

Pros & Cons : 
1. https://www.quora.com/What-are-the-pros-and-cons-of-learning-Scala-as-the-first-functional-language
2. https://dzone.com/articles/to-scala-or-not-to-scala-that-is-the-question
3. http://blog.celerity.com/pros-cons-scala
4. http://jim-mcbeath.blogspot.com/2010/12/scala-pros-and-cons.html
