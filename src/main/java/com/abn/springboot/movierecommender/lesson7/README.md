### Dependency Injection in Spring

#### Constructor Injection

```java

 @Autowired
 public RecommenderImpl1(@Qualifier("CF") Filter filter) {
         super();
         this.filter = filter;
         System.out.println("Constructor invoked...");
         }
```


#### Setter Injection

```java

 @Qualifier("CF")
 @Autowired
 public void setFilter(Filter filter) {
        this.filter = filter;
        System.out.println("Setting method invoked:");
    }

```

#### Field Injection

```java
  @Autowired
  @Qualifier("CF")
  private Filter filter;
```


`Field injection is unsafe to use as Spring may set private fields of objects.`
