# 🔄 spring-lifecycle

Projeto prático para entender o **ciclo de vida dos beans no Spring Framework**.

---

## 🎯 Objetivos

- Demonstrar a ordem de criação, inicialização e destruição de beans.
- Aplicar os conceitos de:
  - `@PostConstruct` / `@PreDestroy`
  - `BeanPostProcessor`
  - `BeanFactoryPostProcessor`
  - `@DependsOn`
  - `@Primary` e `@Qualifier`

---

## 🧠 Conceitos aplicados

| Conceito                    | Descrição                                                                 |
|----------------------------|---------------------------------------------------------------------------|
| `@PostConstruct`           | Método executado após a injeção de dependências                           |
| `@PreDestroy`              | Método executado antes da destruição do bean                              |
| `BeanPostProcessor`        | Intercepta a inicialização dos beans (antes/depois)                       |
| `BeanFactoryPostProcessor` | Modifica definições de beans antes da instância                           |
| `@DependsOn`               | Define ordem explícita entre beans                                        |
| `@Primary` / `@Qualifier`  | Resolve conflitos de injeção quando há múltiplos beans do mesmo tipo       |

---

## 📁 Estrutura sugerida do projeto

```css
spring-lifecycle/
└── src/
    └── main/
        ├── java/com.example.springlifecycle/
        │   ├── SpringLifecycleApplication.java
        │   ├── config/
        │   │   ├── MyBeanPostProcessor.java
        │   │   ├── MyBeanFactoryPostProcessor.java
        │   │   └── ConfigBeans.java
        │   └── service/
        │       ├── ServiceA.java
        │       ├── ServiceB.java
        │       └── LifecycleService.java
        └── resources/
            └── application.yml
```

## 📊 Fluxograma visual (simples)

```plaintext
+---------------------------+
| SpringApplication.run()  |
+---------------------------+
             |
             v
+-----------------------------+
| BeanFactoryPostProcessor   |  ← 🏗️ Modifica definições
+-----------------------------+
             |
             v
+-----------------------------+
| Criar beans (ex: ServiceA) |
+-----------------------------+
             |
             v
+-----------------------------+
| BeanPostProcessor.before() |  ← 🔧 Ação antes da inicialização
+-----------------------------+
             |
             v
+-----------------------------+
| @PostConstruct              |  ← 🚀 Bean iniciado
+-----------------------------+
             |
             v
+-----------------------------+
| BeanPostProcessor.after()  |  ← ✅ Ação depois da inicialização
+-----------------------------+
             |
             v
+-----------------------------+
| Aplicação em execução      |
+-----------------------------+
             |
             v
+-----------------------------+
| Encerramento da aplicação  |
+-----------------------------+
             |
             v
+-----------------------------+
| @PreDestroy                 |  ← 🧹 Bean será destruído
+-----------------------------+
```
## ▶️ Como executar
```bash
./gradlew bootRun
```

---

**Kleber Vales**  

*Back-end Software Engineer*  
Java + Spring Boot | Cloud & DevOps | Git & GitHub | Scrum | JUnit | Hibernate  

Bacharel em Ciência da Computação  
MBA em Desenvolvimento de Software (Cursando)

