from web import web

url = input('Здравствуй, введи адрес страницы: ')
depth = input('Теперь введи величину глубины поиска: ')

web = web(url, depth)

web.scan()

