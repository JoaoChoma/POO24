from motor.motor_asyncio import AsyncIOMotorClient
from bson.objectid import ObjectId

# Conexão com o banco de dados MongoDB
client = AsyncIOMotorClient("mongodb://mongodb:27017")
db = client["task_manager_db"]

# Função para adicionar um novo usuário
async def add_user(user_data: dict) -> dict:
    user = await db["users"].insert_one(user_data)
    new_user = await db["users"].find_one({"_id": user.inserted_id})
    return new_user

# Função para recuperar um usuário pelo nome de usuário
async def retrieve_user(username: str) -> dict:
    user = await db["users"].find_one({"username": username})
    return user

# Função para adicionar um novo projeto
async def add_project(project_data: dict) -> dict:
    project = await db["projects"].insert_one(project_data)
    new_project = await db["projects"].find_one({"_id": project.inserted_id})
    return new_project

# Função para recuperar os projetos do usuário
async def retrieve_user_projects(username: str) -> list:
    projects = await db["projects"].find({"members": username}).to_list(100)
    return projects

# Função para atualizar as informações de um usuário
async def update_user(username: str, user_data: dict) -> bool:
    user = await db["users"].update_one({"username": username}, {"$set": user_data})
    return user.modified_count > 0

# Função para excluir um usuário
async def delete_user(username: str) -> bool:
    user = await db["users"].delete_one({"username": username})
    return user.deleted_count > 0

# Função para recuperar um projeto pelo ID
async def retrieve_project(project_id: str) -> dict:
    project = await db["projects"].find_one({"id": project_id})
    return project

# Função para atualizar um projeto
async def update_project(project_id: str, project_data: dict) -> dict:
    result = await db["projects"].update_one(
        {"_id": ObjectId(project_id)}, {"$set": project_data}
    )
    if result.modified_count == 1:
        updated_project = await db["projects"].find_one({"_id": ObjectId(project_id)})
        return updated_project
    return None

async def delete_project(project_id: str) -> bool:
    project = await retrieve_project(project_id)
    if project:
        await db["projects"].delete_one({"id": project_id})
        return True
    return False