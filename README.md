# CLI Task Manager

A simple command-line task manager app built for managing tasks efficiently through basic commands. This app allows you to add, update, delete, mark tasks as done or in progress, and list them based on their status.

## Features

- **Add** new tasks.
- **Update** the name of an existing task.
- **Delete** tasks.
- **Mark tasks** as done or in progress.
- **List tasks** based on their status (done, in progress, or not done).
- **Exit** the application.

## Available Commands

The following commands can be used to manage tasks:

| Command                            | Description                                                 |
| ---------------------------------- | ----------------------------------------------------------- |
| `add <task_name>`                  | Adds a new task with the given name.                        |
| `update <task_number> <task_name>` | Updates the name of the task at the specified task number.  |
| `delete <task_number>`             | Deletes the task at the specified task number.              |
| `mark_done <task_number>`          | Marks the task at the specified task number as done.        |
| `mark_in_progress <task_number>`   | Marks the task at the specified task number as in progress. |
| `list_done`                        | Lists all tasks that are marked as done.                    |
| `list_in_progress`                 | Lists all tasks that are marked as in progress.             |
| `list_not_done`                    | Lists all tasks that are not done.                          |
| `list_all`                         | Lists all tasks regardless of their status.                 |
| `exit`                             | Exits the application.                                      |

## How to Use

1. Clone this repository or download the files to your local machine.
2. Open a terminal or command prompt.
3. Navigate to the folder where the app is stored.
4. Run the task manager app by executing `node <filename>.js` (replace `<filename>` with your app's filename).
5. Start entering commands to manage your tasks.

### Example Usage:

```bash
Enter the command !
add First task
Task added successfully

Enter the command !
update 0 first task
Task updated successfully

Enter the command !
list_all
Task Number: 0
Task Name: first task
Task Status: Not Done
-------------------------------------------

Enter the command !
list_done
Enter the command !
list_in_progress

Enter the command !
add second
Task added successfully

Enter the command !
mark_done 1
Marked done!

Enter the command !
delete 1
Task deleted successfully

Enter the command !
exit
Exiting the app...
```

Project Idea: https://roadmap.sh/projects/task-tracker
