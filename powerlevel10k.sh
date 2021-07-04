sudo apt update
sudo apt install zsh git curl -y
git clone --depth=1 https://github.com/romkatv/powerlevel10k.git ~/.config/powerlevel10k
echo 'source ~/.config/powerlevel10k/powerlevel10k.zsh-theme' >> ~/.zshrc
chsh --shell /usr/bin/zsh $USER
zsh
