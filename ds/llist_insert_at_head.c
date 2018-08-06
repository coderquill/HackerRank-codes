/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode* next;
 * };
 *
 */
SinglyLinkedListNode* insertNodeAtHead(SinglyLinkedListNode* llist, int data) {
     
    
    SinglyLinkedListNode* temp;
        temp= new SinglyLinkedListNode(data);       
        temp->data=data;
        temp->next=NULL;
        if(llist==NULL)
            return temp;
         temp->next=llist;
        llist=temp;
       
    return llist;


}