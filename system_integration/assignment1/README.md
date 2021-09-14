# System Integration
### Assignment 1 - Research: Domain Driven Design
##### By Camilla Jenny Valerius Staunstrup, 5. september 2021
![image](https://user-images.githubusercontent.com/35559774/132123887-a41b6807-c1a6-4b7d-abe9-c207e8117907.png)

### Objective:
- Research the Internet and/or the recommended books and find the answers of the following questions:  
![image](https://user-images.githubusercontent.com/35559774/132123869-db053cd7-cc77-400d-9597-33fd833683e0.png)

#### What is DDD?
- Domain Driven Design
- DDD → an approach used to build a software model of a real-world system with a complex business domain by making a ubiquitous language and a conceptual description of the system. Software for a bank would have an ubiquitous language consisting of words like “customer”, “account”, “balance” etc. The domain model will be built in the domain context by using the ubiquitous language.
![image](https://user-images.githubusercontent.com/35559774/132123870-4d9d914d-a1e4-48c8-af9f-bd879fb7abc4.png)

#### When did it originate?
- The name comes from a 2003 book by Eric Evans.  
  - *Domain-Driven Design: Tackling Complexity in the Heart of Software
by Eric Evans, 2003, Publisher: Addison-Wesley; ISBN: 0-321-12521-5*
![image](https://user-images.githubusercontent.com/35559774/132123871-5382f8a3-0a36-4c0c-9509-8220b2444de6.png)

#### Which problems did it address?
- How to solve complexity in large systems is made easier with DDD.  
![image](https://user-images.githubusercontent.com/35559774/132123873-a5aa3114-2dbf-4366-8a94-e40c919400a1.png)

#### Which are the basic concepts and building blocks of a domain model?
- The domain model exists within the domain context and includes boundaries, usage within  specific areas of the system, ideas, knowledge and goals. The model also contains rules and patterns that are relevant.

  - Value objects → a value that might have sub-values (time can have the sub-values hour, minute, second)
  - Entities → objects with an identity (customer object has its own identity)
  - Aggregate roots → objects that own other objects, i.e. a credit card object doesn't make sense without an account to belong to →  account is the aggregate root, and credit card objects can only be manipulated via methods in the Order object.

- In DDD some of the patterns used are:
  - Repository →  for persistence (saving and loading data.)
  - Factory → for object creation.
  - Service → for creating objects that manipulate the main domain objects without being a part of the domain themselves.

- Core concepts:
  - Domain → The specific business subject area.
  - Model → A system of abstractions that describes selected aspects of a domain and can be used to solve problems related to that domain.
  - Ubiquitous Language → A language structured by capturing the terms of the domain, with help from domain experts, which is used throughout the development.
  - Context → The setting in which a statement appears that determines its meaning.
  - Bounded context → A boundary (typically a subsystem) within which a particular model is defined and applicable.  
![image](https://user-images.githubusercontent.com/35559774/132123877-e9de2258-24d3-420c-96f1-cf278d71d0e6.png)

#### How does DDD relate to microservices architecture?
> *“The term "Microservice Architecture" has sprung up over the last few years to describe a particular way of designing software applications as suites of independently deployable services. While there is no precise definition of this architectural style, there are certain common characteristics around organization around business capability, automated deployment, intelligence in the endpoints, and decentralized control of languages and data. [...]
Applications built from microservices aim to be as decoupled and as cohesive as possible - they own their own domain logic and act more as filters in the classical Unix sense - receiving a request, applying logic as appropriate and producing a response.”*

[Martin Fowler](https://martinfowler.com/articles/microservices.html) 25 March 2014.

- Domain driven design fits well within a microservice architecture because each microservice will have its own bounded context and have a separate domain model.  
![image](https://user-images.githubusercontent.com/35559774/132123882-4960a036-49f5-4f3c-8746-f5d0f25e0337.png)

### Litterature
- [martinfowler.com/articles/microservices.html](https://martinfowler.com/articles/microservices.html)
- [martinfowler.com/bliki/DomainDrivenDesign.html](https://martinfowler.com/bliki/DomainDrivenDesign.html)
- [confluent.io/blog/microservices-apache-kafka-domain-driven-design/](https://www.confluent.io/blog/microservices-apache-kafka-domain-driven-design/)
- [simpleprogrammer.com/importance-domain-driven-design/](https://simpleprogrammer.com/importance-domain-driven-design/)
- [medium.com/microtica/the-concept-of-domain-driven-design-explained](https://medium.com/microtica/the-concept-of-domain-driven-design-explained-3184c0fd7c3f)
- [medium.com/ssense-tech/domain-driven-design-everything-you-always-wanted-to-know-about-it-but-were-afraid-to-ask](https://medium.com/ssense-tech/domain-driven-design-everything-you-always-wanted-to-know-about-it-but-were-afraid-to-ask-a85e7b74497a)
- [airbrake.io/blog/software-design/domain-driven-design](https://airbrake.io/blog/software-design/domain-driven-design)
- [towardsdatascience.com/what-is-domain-driven-design](https://towardsdatascience.com/what-is-domain-driven-design-5ea1e98285e4)
- [lucidchart.com/blog/domain-driven-design-introduction](https://www.lucidchart.com/blog/domain-driven-design-introduction)
- [Driven%20Design%20Quickly.pdf](https://matfrs2.github.io/RS2/predavanja/literatura/Avram%20A,%20Marinescu%20F.%20-%20Domain%20Driven%20Design%20Quickly.pdf)
- [stackoverflow.com/questions/1222392/what-is-domain-driven-design](https://stackoverflow.com/questions/1222392/what-is-domain-driven-design-ddd/1222488#1222488)

test
