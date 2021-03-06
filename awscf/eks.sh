if which eksctl > /dev/null; then 
    echo "eksctl is already installed"
    exit 0
fi
mkdir -p eksctl_download
curl --silent --location --retry 5 "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C eksctl_download
chmod +x eksctl_download/eksctl
SUDO=""
if [ $(id -u) -ne 0 ] && which sudo > /dev/null ; then
    SUDO="sudo"
fi
sudo mv eksctl_download/eksctl /usr/local/bin/
rmdir eksctl_download  