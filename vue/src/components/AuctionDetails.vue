<template>
    
</template>

<script>


export default {
    name:"auction-details" ,
    methods:{
        deleteItem(id) {
            auctionService.delete(id).then(response.status == 200) {
                this.getUserItem();
        }
        }
    }
            
        

        

    
};
</script>