cd path/to/your/project
git remote -v
git remote add origin <repository-URL>  # If no remote link exists
git remote set-url origin <repository-URL>  # If the URL is incorrect
git branch -M main
git add .
git commit -m "Reconnect project"
git push -u origin main
