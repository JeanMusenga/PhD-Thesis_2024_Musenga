# System Integration
#### Assignment 5: EIP Research Task
#### By Camilla Jenny Valerius Staunstrup, 13. october 2021
![image](https://user-images.githubusercontent.com/35559774/132123869-db053cd7-cc77-400d-9597-33fd833683e0.png)

### Objective
- Read the [Chapter 3: Messaging Systems](https://www.enterpriseintegrationpatterns.com/docs/EnterpriseIntegrationPatterns_HohpeWoolf_ch03.pdf), extract at least ten terms, related to System Integration, which you find essential and create a glossary of those terms.  

### Glossary
The chapter from which these terms originated are specifically about Messaging and not necessarily System Integration. Though, since Messaging is a part of the curriculum and highly relevant for System Integration it could be argued that all the following terms are related to System Integration. 

**Channels**  
Applications using messaging transmit data through a message channel which is a virtual pipe that connects a sender to a receiver. The messaging system will have different channels for different types of information. 

**Messages**  
Is an atomic packet of data and consists of a header (metadata) and a body (the actual data). For an application to transmit information, the data is broken down in one (message) or several packets (message sequence). The message-system will retry delivery of a message until it succeeds. Messaging ensures loose coupling in applications.

**Pipes and Filters**  
By using the architectural style of ‘Pipes and Filters’ in a messaging system, it’s possible to divide a larger messaging processing task into a sequence of smaller, independent processing steps (filters) that are connected by pipes (channels ). An example could be a message that requires both decryption and authentication. By separating these two by steps in different components by pipes another message which only requires decryption could use the same component. 

**Message Translator/Transformation**  
To ensure communication (in the same enterprise system) between several applications, where some may be using different data formats, a specific filter, a Message Translator, is useful. This messaging processing task will translate between the varying data formats in use in the system and ensure that no application-specific code needs to be changed (which could be infeasible in a legacy system). Message translation may need to occur at a number of different levels.

**Message Router**  
A Message Router is a component that takes the place of a filter. The router determines how to navigate the often complex channel topology and directs messages either to the final receiver or to the next router.

**Decoupling**  
The decoupling of components in a larger system is often necessary. Decoupling refers to components not being dependent on other components i.e. a change in one does not require a change in others. 
Message Channels decouples applications from having to know each other’s location. 
A Message Router decouples applications from having to agree on a common Message Channel. 
A Message Translator decouples applications by removing the dependency on each other’s data formats.

**Message Endpoint**  
For an application to use the Messaging system, a form of interface must be implemented. The Message Endpoint bridges that gap by encapsulating the messaging system from the rest of the application and customizes a general messaging API for a specific application and task, thus enabling the application to send and receive messages.

**Processing pipeline**  
By using asynchronous Message Channels in the process chain there’s no waiting for subsequent components to read and process the message. When a component has completed processing one message, it can send the message to the output channel and immediately start processing another message. This is a Processing pipeline and the system throughput is significantly increased compared to sequential processing. 

**Parallel Processing**  
Since the system throughput is limited by the slowest process in the process chain described above, Parallel processing can be implemented to increase throughput. This means that multiple instances of time-intensive processes are deployed as competing consumers which allows for multiple of the same processes to happen simultaneously.

**Point-to-Point Channel**  
A Point-to-Point Channel ensures that only one component consumes any given message. If the channel has multiple receivers, only one of them can successfully consume a particular message.


### Litterature
- https://www.enterpriseintegrationpatterns.com/docs/EnterpriseIntegrationPatterns_HohpeWoolf_ch03.pdf



