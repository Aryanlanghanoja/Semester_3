import vlc

instance = vlc.Instance()
player = instance.media_player_new()
media = instance.media_new('Buzzer.mpeg')  # Replace with your audio file path
#player.set_media(media)
#player.play()

a = input("Enter A Word 'PLAY' to Play the Song :- ")

if a =='PLAY' :
    player.set_media(media)
    player.play()
    
else :
    print("Enter Valid String")

    


