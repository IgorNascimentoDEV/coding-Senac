var builder = WebApplication.CreateBuilder(args);
var app = builder.Build();

IRepostorio repositorio = new RepositorioClienteMySQL();

app.MapGet("/Clientes/", () =>
{
    try
    {
        return Results.Ok(repositorio.Listar());
    }
    catch (Exception ex)
    {
        return Results.BadRequest($"Ocorreu um erro, procure o suporte! {ex.Message}");
    }
});
app.MapGet("/Cliente/{id}", (int id) => repositorio.Buscar(id));
app.MapPost("/Cliente/", (Cliente cliente) =>
{
    try
    {
        repositorio.Inserir(cliente);
        return Results.Ok("Sucesso");
    }
    catch (Exception ex)
    {
        return Results.BadRequest($"Ocorreu um erro, procure o suporte! {ex.Message}");
    }
});
app.MapDelete("/Cliente/{id}", (int id) => repositorio.Deletar(id));
app.MapPut("/Cliente/{id}", (int id, Cliente cliente) => repositorio.Atualizar(id, cliente));

app.Run();