# Notion — Cars Backend

Este arquivo guarda os IDs e contexto do Notion para que qualquer sessão do Claude possa atualizar a página do projeto sem precisar procurar nada.

## Página principal

- **Título:** Cars Backend
- **URL:** https://www.notion.so/35b160bd0eeb809e975ffac36426d834
- **ID:** `35b160bd-0eeb-809e-975f-fac36426d834`
- **Pai:** Work → Cars Backend

## Task Management (Kanban)

- **Database ID:** `35b160bd-0eeb-81cf-b694-f395ad5efd9c`
- **Data Source ID:** `35b160bd-0eeb-810c-9ff2-000bfaaf0428`

### Cards atuais

| Card | ID | Status | Prioridade |
|---|---|---|---|
| Car CRUD | `364160bd-0eeb-81e0-affa-e42a42386e37` | Done | High 🔥 |
| User CRUD | `364160bd-0eeb-815f-b0c7-df748e18fe48` | Done | High 🔥 |
| Fipe | `364160bd-0eeb-81c5-a2f8-e7871df729ac` | Done | Medium ⏳ |
| Image CRUD | `364160bd-0eeb-81e4-a731-fc98d5909987` | Done | Low 💤 |
| User Auth | `364160bd-0eeb-8172-984c-ea3dd1e76694` | To-Do | High 🔥 |
| Tratamento de Exceções | `364160bd-0eeb-81ed-8e30-dc4fcf5dd538` | To-Do | High 🔥 |
| Logs | `364160bd-0eeb-8187-bdfa-ecd3809901b9` | To-Do | High 🔥 |
| Swagger / OpenAPI | `364160bd-0eeb-81da-8ccc-e0fea86af48e` | To-Do | Medium ⏳ |
| JUnit | `364160bd-0eeb-814c-b9b9-c0eac30b1df6` | To-Do | Medium ⏳ |
| Redis — Cache | `364160bd-0eeb-81ac-98a3-ff820c6aaae2` | To-Do | Low 💤 |

### Ordem de implementação

1. Tratamento de Exceções
2. Logs
3. Swagger / OpenAPI
4. JUnit
5. Redis — Cache

### Propriedades disponíveis nos cards

- **Status:** `To-Do` · `In Progress` · `Done`
- **Priority:** `High 🔥` · `Medium ⏳` · `Low 💤`
- **Category:** `Work` · `Personal` · `Learning` · `Other`
- **Notes & Details:** texto livre
- **Due Date:** data

## Como atualizar via Claude

Quando o usuário disser que implementou algo ou mudou o status de uma feature:

1. Usar `mcp__notion__API-patch-page` com o `page_id` do card correspondente para atualizar `Status`
2. Se necessário, atualizar o conteúdo do card com `mcp__claude_ai_Notion__notion-update-page`
3. Atualizar a tabela "Cards atuais" neste arquivo para refletir o novo status
4. Se for uma feature nova sem card, criar com `mcp__claude_ai_Notion__notion-create-pages` no data source acima

Exemplo para mover um card para "In Progress":
```
mcp__notion__API-patch-page
  page_id: <id do card>
  properties: { "Status": "In Progress" }
```
