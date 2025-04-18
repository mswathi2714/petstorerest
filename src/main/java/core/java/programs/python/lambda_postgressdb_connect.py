import psycopg2

def get_record():
      conn = psycopg2.connect(
                            database="db-name",
                            host="mydb.com",
                            user="db_user",
                            password="db_password",
                            port="3306")
       cursor = conn.cursor()

       cursor.execute("SELECT count(*) FROM public.mytable")
       res = cursor.fetchall()

       for row in res:
         total_records = format(row[0])

       print(total_records)

