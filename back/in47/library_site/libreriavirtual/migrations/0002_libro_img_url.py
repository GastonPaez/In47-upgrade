# Generated by Django 4.2.1 on 2023-06-09 12:52

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('libreriavirtual', '0001_initial'),
    ]

    operations = [
        migrations.AddField(
            model_name='libro',
            name='img_url',
            field=models.URLField(default='https://unrulyguides.com/wp-content/uploads/2011/12/generic-cover.jpg'),
        ),
    ]
