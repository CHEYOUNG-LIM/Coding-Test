#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

char* solution(const char* str_list[], size_t str_list_len, const char* ex) {
    char* answer = (char*)malloc(10000);
    
    for(int i = 0 ; i < str_list_len ; i++) {
        if (!strstr(str_list[i], ex)) {
            strcat(answer, str_list[i]);
        }
    }
    free(answer);
    return answer;
}