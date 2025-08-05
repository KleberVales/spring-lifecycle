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

