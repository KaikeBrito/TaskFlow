-- Inserir USUÁRIOS
INSERT INTO tb_users (name, email, age, username, password, role, created_at, is_active) VALUES ('Admin', 'admin@taskflow.com', 30, 'admin', '$2a$10$7Zi5UeGw7lBQZ8Q3e6qB.uL.3VjO4s1Tk1W6oN5Zz9y1JkXb6mDdK', 'ADMIN', '2024-05-25 09:00:00', true);
INSERT INTO tb_users (name, email, age, username, password, role, created_at, is_active) VALUES ('João Silva', 'joao@taskflow.com', 28, 'joao.silva', '$2a$10$7Zi5UeGw7lBQZ8Q3e6qB.uL.3VjO4s1Tk1W6oN5Zz9y1JkXb6mDdK', 'USER', '2024-05-25 09:05:00', true);
INSERT INTO tb_users (name, email, age, username, password, role, created_at, is_active) VALUES ('Maria Souza', 'maria@taskflow.com', 35, 'maria.souza', '$2a$10$7Zi5UeGw7lBQZ8Q3e6qB.uL.3VjO4s1Tk1W6oN5Zz9y1JkXb6mDdK', 'MANAGER', '2024-05-25 09:10:00', true);

-- Inserir EQUIPES (TEAMS)
INSERT INTO tb_teams (name, description, created_at) VALUES ('Equipe Dev', 'Equipe de desenvolvimento', '2024-05-25 10:00:00');
INSERT INTO tb_teams (name, description, created_at) VALUES ('Equipe UX', 'Designers de interface', '2024-05-25 10:15:00');

-- Relacionar USUÁRIOS a EQUIPES (Tabela team_members - Many-to-Many)
INSERT INTO team_members  (team_id, user_id) VALUES (1, 1);
INSERT INTO team_members  (team_id, user_id) VALUES (1, 2);
INSERT INTO team_members  (team_id, user_id) VALUES (2, 3);

-- Inserir TAREFAS (TASKS)
INSERT INTO tb_tasks (title, description, status, priority, due_date, created_at, updated_at, created_by_user_id, assigned_to_user_id) VALUES ('Implementar Login', 'Sistema de autenticação JWT', 'TODO', 'HIGH', '2024-05-30 18:00:00', '2024-05-25 10:00:00', '2024-05-25 10:00:00', 1, 2);
INSERT INTO tb_tasks (title, description, status, priority, due_date, created_at, updated_at, created_by_user_id, assigned_to_user_id) VALUES ('Redesign do Dashboard', 'Melhorar UI/UX', 'IN_PROGRESS', 'MEDIUM', '2024-05-28 12:00:00', '2024-05-25 10:15:00', '2024-05-25 10:15:00', 3, 3);

-- Relacionar TAREFAS a EQUIPES (Tabela task_teams - Many-to-Many)
INSERT INTO task_teams  (task_id, team_id) VALUES (1, 1);
INSERT INTO task_teams  (task_id, team_id) VALUES (2, 2);

-- Inserir Tags
INSERT INTO tb_tags (name, color) VALUES ('Marketing', 'Vermelho');
INSERT INTO tb_tags (name, color) VALUES ('Tecnologia da Informação', 'Azul');

-- Relacionar TASKS com TAGS
INSERT INTO task_tags (task_id, tag_id) VALUES (1, 2);
INSERT INTO task_tags (task_id, tag_id) VALUES (2, 1);

-- Inserir Notifications
INSERT INTO tb_notifications (message, created_at, is_read, notifications_user_id) VALUES('Usuário em estado de ausência', '2024-05-25 09:00:00', true, 2);
INSERT INTO tb_notifications (message, created_at, is_read, notifications_user_id) VALUES ('Usuario presente', '2024-05-25 09:00:00', TRUE, 1);

