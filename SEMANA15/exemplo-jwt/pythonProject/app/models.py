from pydantic import BaseModel, Field
from typing import Optional, List

# Modelo para registrar e validar usuários
class UserSchema(BaseModel):
    username: str = Field(..., description="Nome de usuário do sistema")
    password: str = Field(..., description="Senha para o usuário")
    email: Optional[str] = Field(None, description="Email do usuário")
    full_name: Optional[str] = Field(None, description="Nome completo do usuário")
    disabled: Optional[bool] = Field(False, description="Usuário está desabilitado ou não")

# Modelo para criação de projetos (usado como input na criação)
class ProjectCreateSchema(BaseModel):
    name: str = Field(..., description="Nome do projeto")
    description: Optional[str] = Field(None, description="Descrição opcional do projeto")

# Modelo completo de projetos (usado como output)
class ProjectSchema(ProjectCreateSchema):
    id: str = Field(..., description="ID único do projeto")
    owner: str = Field(..., description="Dono do projeto")
    members: List[str] = Field(default=[], description="Lista de membros do projeto")

# Modelo para representar o usuário autenticado no sistema
class CurrentUser(BaseModel):
    username: str = Field(..., description="Nome de usuário autenticado")
    email: Optional[str] = Field(None, description="Email do usuário autenticado")
    full_name: Optional[str] = Field(None, description="Nome completo do usuário autenticado")
    disabled: Optional[bool] = Field(False, description="Usuário autenticado está desabilitado ou não")

    class Config:
        orm_mode = True
