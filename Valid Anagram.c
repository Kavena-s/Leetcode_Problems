int comp(const void* a,const void* b){
    return (*(char*)a - *(char*)b);
}

bool isAnagram(char* s, char* t) {
    if(strlen(s)!=strlen(t))
        return false;
    qsort(s,strlen(s),sizeof(char),comp);
    qsort(t,strlen(t),sizeof(char),comp);
    for(int i=0 ; i<strlen(s) ; i++){
        if(s[i] != t[i]){
            return false;
        }
    }
    return true;
}
