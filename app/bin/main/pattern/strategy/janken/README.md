# じゃんけん

```mermaid
classDiagram
    Player o-- Strategy
    Strategy <|-- RandomStrategy
    Strategy <|-- RepeatStrategy

    class Player {
        +Strategy strategy
    }

```


