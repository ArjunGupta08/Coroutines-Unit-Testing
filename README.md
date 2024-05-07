# Learn how to test coroutines. 
- Learn how to use runTest in unit test cases in Android. 
- Difference between runBlocking and runTest.
- What is the use of StandardTestDispatcher? How to use test dispatcher for Dispatchers.Main in test cases.
- Injecting test dispatcher for cases where we hardcode dispatchers.
- Learn about advanceUntilIdle function for executing coroutines that are scheduled.
- Testing coroutines in android is easier, we just need to use test dispatcher everywhere.
- To support this, code should be modular so that we can inject the required dispatcher based on the requirement. 

Learn how to create JUnit rules. We have created a simple rule for setting up Dispatchers for main. MainCoroutineRule is the recommended way of doing Dispatchers.setMain and Dispatchers.resetMain. 

`Topics covered` - 
1. runBlocking vs runTest
2. TestDispatcher setup
3. Dispatchers.Main Unit Testing
4. Inject Test Dispatcher for other dispatchers.
5. MainCoroutineRule - JUnit Rule
6. advanceUntilIdle concept
