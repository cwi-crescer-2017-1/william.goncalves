namespace EditoraCrescer.Infraesturtura.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class PermitindoCamposNulosDatas : DbMigration
    {
        public override void Up()
        {
            AlterColumn("dbo.Livros", "DataPublicacao", c => c.DateTime());
            AlterColumn("dbo.Livros", "DataRevisão", c => c.DateTime());
        }
        
        public override void Down()
        {
            AlterColumn("dbo.Livros", "DataRevisão", c => c.DateTime(nullable: false));
            AlterColumn("dbo.Livros", "DataPublicacao", c => c.DateTime(nullable: false));
        }
    }
}
