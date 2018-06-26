# flight tickets

RxJava FlatMap, ConcatMap Operators.

* flatMap() returns an Observable by merging many Observables together.

* ConcatMap() maintains the order of items and waits for the current Observable to complete its job before emitting the next one.
* ConcatMap is more suitable when you want to maintain the order of execution.
