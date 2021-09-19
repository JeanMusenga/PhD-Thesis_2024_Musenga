# System Integration
### Assignment 2 - Reading Task 2: SOA
##### By Camilla Jenny Valerius Staunstrup, 19. september 2021
![image](https://user-images.githubusercontent.com/35559774/132123887-a41b6807-c1a6-4b7d-abe9-c207e8117907.png)

### Objective:
- We are investigating various technologies and platforms for software integration. Your task is to research and describe the technology, called SOA (Service-Oriented Architecture). On up to two pages, give an answer to the following questions, in text and diagrams, as appropriate:    
![image](https://user-images.githubusercontent.com/35559774/132123869-db053cd7-cc77-400d-9597-33fd833683e0.png)

#### What is SOA?
- Service-oriented architecture (SOA)
  - Service-orientation is a design paradigm that has a focus on the separation of different complexities in the software into services. 
  - A service is a self contained part of the software with its own well defined responsibility.  
![image](https://user-images.githubusercontent.com/35559774/132123870-4d9d914d-a1e4-48c8-af9f-bd879fb7abc4.png)

#### Which are the main building blocks of SOA architecture? 
- Service provider
  - Creates a web service and decides which services to expose, their availability, security and possibly pricing. 
- Service repository
  - Collection of service providers available to any potential service consumer. Scope of the repository can be public or private. The focus of the repository can be industry specific or broad or some other main theme. 
- Service consumer
  - Locates the entries in the service repository collection and then binds to the service provider to invoke one of its web services.  
![image](https://user-images.githubusercontent.com/35559774/132123871-5382f8a3-0a36-4c0c-9509-8220b2444de6.png)

#### What are the advantages and disadvantages of applying it in enterprise applications development? 
**Advantages**
- Reusability
  - The self contained services can be used in other applications.
- Maintainability
  - Services don’t influence each other and because of that, updating, maintaining or refactoring a service only affects the service itself. 
- Testability
  - Individual services are easier to debug and test since their area of influence is limited to the service. 
- Independence
  - Services are independent of the platform, since they communicate with other applications through common language. 
- Scalable
  - A single service can be run in several instances on different servers at the same time, increasing the scalability. 
- Quality
  - The reusability of the services minimizes code redundancies, which improves the quality of the code.  
   
**Disadvantages**
- Performance/overhead
  - Services-to-service interaction requires validation of the input parameters, which reduces the performance
- Service Management
  - Service-to-service messaging growth is high and the management of this can be challenging and requires enough bandwidth for this.  
- High Cost
  - Initial investment in implementing SOA are high in terms of development and technology.  
![image](https://user-images.githubusercontent.com/35559774/132123873-a5aa3114-2dbf-4366-8a94-e40c919400a1.png)

#### Which basic principles should the developers of SOA consider? 
- Standardized Service Contract
  - Services adhere to a standard service-description.
- Loose Coupling
  - The relationship between services is minimized.
  - Services can be called from anywhere within the network
- Service Abstraction
  - Inner logic of a service is hidden from the consumer.
- Service Reusability
  - Logic is divided into several services, to ensure reusability of code.
- Service Autonomy
  - Services themselves control the logic they contain.
- Service Statelessness	
  - Services are stateless to minimize resource use. 
- Service Discovery
  - Services can be discovered by a service repository. They contain metadata by which they can be discovered and understood.
- Service Composability
  - Services can be used to compose other services.   
![image](https://user-images.githubusercontent.com/35559774/132123877-e9de2258-24d3-420c-96f1-cf278d71d0e6.png)

#### There exists a document, known as SOA Manifesto, which defines six values of priority in the work of the developers of SOA. Write those values in your own priority order (these you find most important should be at the top of the list) and explain your arguments.
> _**Business value** over technical strategy  
**Strategic goals** over project-specific benefits  
**Intrinsic interoperability** over custom integration  
**Shared services** over specific-purpose implementations  
**Flexibility** over optimization  
**Evolutionary refinement** over pursuit of initial perfection_   
  
[SOA Manifesto](http://www.soa-manifesto.org/)

I believe the order in which they are defined in the SOA manifesto is the correct order for two reasons:  
**1)** I don’t believe that I could know better than the people who invented this architecture, after reading about SOA for a few days.  
**2)** When looking at the initial priority of the values, I agree with the order. It makes perfect sense to place business value and strategic goals at the top and flexibility and refinement at the bottom when looking at it from a (enterprise) business perspective.

![image](https://user-images.githubusercontent.com/35559774/132123882-4960a036-49f5-4f3c-8746-f5d0f25e0337.png)

### Litterature
- http://www.soa-manifesto.org/
- https://www.informit.com/articles/article.aspx?p=1663690
- https://www.talend.com/resources/service-oriented-architecture/
- https://www.ibm.com/docs/en/was/9.0.5?topic=architecture-web-services-approach-service-oriented
- https://docs.oracle.com/cd/E21764_01/doc.1111/e10223/soa_01.htm
- https://www.educba.com/what-is-soa/
- https://techspirited.com/advantages-disadvantages-of-service-oriented-architecture-soa
- https://www.xenonstack.com/insights/service-oriented-architecture


