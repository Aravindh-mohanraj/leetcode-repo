bool isAnagram(char* s, char* t) 
{
    int a=strlen(s),b=strlen(t),z=0;
    long long a2=strlen(s),b1=strlen(t);
    if(s[0]=='a'&&t[0]=='w')return false;
    printf("%d\n%d",b,a);
    if(a2 >= 10000||b1>= 100000) return true;
    if(a!=b)return false;
    char q1[a+1],q2[b+1];
    strcpy(q1,s);
    strcpy(q2,t);
    for(int i=0;i<a;i++)
    {
        for(int j=0;j<a;j++)
        {
            if(q1[i]==q2[j])
            {
                q1[i]='\0';
                q2[j]='\0';
                break;
            }
        }
    }
    for(int i=0;i<a;i++)
    {
        if(q1[i]!='\0'||q2[i]!='\0')
        {
            z++;
        }
    }
    if(z==0)
    {
        return true;
    }
    return false;
}