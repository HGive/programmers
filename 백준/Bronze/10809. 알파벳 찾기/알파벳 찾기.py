import string

S = input()


def get_idx(S):
    result = [-1]*len(string.ascii_lowercase)
    for i in range(len(S)):
        idx = ord(S[i]) -97
        if result[idx]== -1 :
            result[idx]= i
    print(' '.join([str(num) for num in result]))


get_idx(S)